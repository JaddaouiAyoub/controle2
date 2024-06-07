package test.controleaj;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@PostMapping("/assign")
public String assignEmployeeToProject(HttpServletRequest request ,Model model) {
    // Récupérer les valeurs des paramètres du formulaire
    Long employeeId = Long.parseLong(request.getParameter("employeeId"));
    Long projectId = Long.parseLong(request.getParameter("projectId"));
    String implication = request.getParameter("implication");

    // Traiter les données et effectuer les opérations nécessaires

    // Rediriger vers une autre page ou retourner le nom de la vue JSP
    return "redirect:/assign";
}
